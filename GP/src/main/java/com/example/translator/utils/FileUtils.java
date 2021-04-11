package com.example.translator.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.springframework.web.multipart.MultipartFile;

import com.example.translator.dto.Constants;

public class FileUtils {
	
	
	public static String upload(MultipartFile file, String rootPath) throws Exception {
		String path = null;
		try {
			if (!file.isEmpty()) {
				path = uploadFile(file, rootPath);
			}
		} catch (Exception e) {
		
			throw new RuntimeException("the provided file is empty");
		}
		return path;

	}


	public static String uploadFile(MultipartFile file, String rootPath) throws Exception {
		if (!file.isEmpty()) {
			File dir = new File(rootPath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			byte[] bytes = file.getBytes();
			// Create the file on server

			String fileName = null;
			fileName = file.getOriginalFilename();
			

			File serverFile = new File(rootPath + File.separator + fileName);
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
			stream.write(bytes);
			stream.close();
			return fileName;
		}
		throw new RuntimeException("the provided file is empty");
	}


	public static File unzip( String uploadedFileName) throws IOException {
		   String fileZip = Constants.UPLOAD_PATH_URL+File.separator +uploadedFileName ;
	        File destDir = new File(fileZip.split("\\.")[0].split("\\(")[0]);
	        byte[] buffer = new byte[1024];
	        ZipInputStream zis = new ZipInputStream(new FileInputStream(fileZip));
	        ZipEntry zipEntry = zis.getNextEntry();
	        while (zipEntry != null) {
	            File newFile = newFile(destDir, zipEntry);
	            if (zipEntry.isDirectory()) {
	                if (!newFile.isDirectory() && !newFile.mkdirs()) {
	                    throw new IOException("Failed to create directory " + newFile);
	                }
	            } else {
	                // fix for Windows-created archives
	                File parent = newFile.getParentFile();
	                if (!parent.isDirectory() && !parent.mkdirs()) {
	                    throw new IOException("Failed to create directory " + parent);
	                }
	                
	                // write file content
	                FileOutputStream fos = new FileOutputStream(newFile);
	                int len;
	                while ((len = zis.read(buffer)) > 0) {
	                    fos.write(buffer, 0, len);
	                }
	                fos.close();
	            }
	        zipEntry = zis.getNextEntry();
	        }
	        zis.closeEntry();
	        zis.close();
	        
	        return destDir;
	}


	public static void moveFile(File inputFile, File outputFile) {
		try {

			FileInputStream inStream = new FileInputStream(inputFile);
			FileOutputStream outStream = new FileOutputStream(outputFile);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = inStream.read(buffer)) > 0) {

				outStream.write(buffer, 0, length);

			}

			inStream.close();
			outStream.close();

			// delete the original file
			inputFile.delete();
		} catch (Exception exception) {
	
		}
	}
	

	public static File getUploadedFile(String filePath, String uploadedFileName) {

		String fileName = filePath;
		if (uploadedFileName != null) {
			fileName += File.separator + uploadedFileName;
		}

		if (fileName == null || fileName.isEmpty()) {
			throw new IllegalStateException("You didn't provide a file.");
		}
		File uploadedFile = new File(fileName);

		if (!uploadedFile.exists()) {
			
		}

		if (uploadedFile.getName().toLowerCase().contains("zip") || uploadedFile.getName().toLowerCase().contains("rar")) {
			try {
				uploadedFile = FileUtils.unzip(uploadedFile.getName());
				//uploadedFile = new File(fileName);
			} catch (Exception exception) {
				
			}
		}
		return uploadedFile;
	}


	public static void moveFolder(File inputFile, File outputFile) {

		if (inputFile.isDirectory()) {
			File[] content = inputFile.listFiles();
			for (int i = 0; i < content.length; i++) {
				// move content[i]
				if (content[i].isDirectory()) {
					outputFile.mkdir();
					moveFolder(content[i], new File(outputFile, content[i].getName()));
				} else {
					outputFile.mkdir();
					moveFile(content[i], new File(outputFile, content[i].getName()));
				}
			}

			// delete Temp Folder
			inputFile.delete();
		}
	}
	
	public static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
	    File destFile = new File(destinationDir, zipEntry.getName());

	    String destDirPath = destinationDir.getCanonicalPath();
	    String destFilePath = destFile.getCanonicalPath();

	    if (!destFilePath.startsWith(destDirPath + File.separator)) {
	        throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
	    }

	    return destFile;
	}
}

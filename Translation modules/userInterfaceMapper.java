import java.util.HashMap;
import java.util.Map;

public class userInterfaceMapper
{
    private Map<String, String> Jsx2ionicMap;

    public userInterfaceMapper()
    {
        Jsx2ionicMap = new HashMap<>();
        Jsx2ionicMap.put("Button", "ion-button");
        Jsx2ionicMap.put("Appbar", "ion-toolbar");
        Jsx2ionicMap.put("label","");
        Jsx2ionicMap.put("Text", "ion-text");
        Jsx2ionicMap.put("View", "div");
        Jsx2ionicMap.put("</TextInput>", "</ion-input>");
        Jsx2ionicMap.put("</Button>","</ion-button>");
        Jsx2ionicMap.put("onPress", "(click)");
        Jsx2ionicMap.put("TextInput","ion-input");
        Jsx2ionicMap.put("value","value");
        Jsx2ionicMap.put("onChangeText","(ionChange)");
        Jsx2ionicMap.put("color","color");
        Jsx2ionicMap.put("style","class");
        Jsx2ionicMap.put("title","label");
        Jsx2ionicMap.put("FlatList","ion-list");
        Jsx2ionicMap.put("ul","ul");
        Jsx2ionicMap.put("li","li");
        Jsx2ionicMap.put("ol","ol");
        Jsx2ionicMap.put("div","div");
        Jsx2ionicMap.put("backgroundColor","background-color");
        Jsx2ionicMap.put("TouchableOpacity","ion-button");
        Jsx2ionicMap.put("</CheckBox>","</ion-checkbox>");
        Jsx2ionicMap.put("</RadioButton>","</ion-radio>");
        Jsx2ionicMap.put("CheckBox","ion-checkbox");
        Jsx2ionicMap.put("onValueChange","(ionChange)");
        Jsx2ionicMap.put("placeholder","placeholder");
        Jsx2ionicMap.put("value","[(ngModel)]");
        Jsx2ionicMap.put("secureTextEntry","type");
        Jsx2ionicMap.put("RadioButton","ion-radio slot="+'"'+"start"+'"');
        Jsx2ionicMap.put("NavigationContainer","");
        Jsx2ionicMap.put("source","[src]");
        Jsx2ionicMap.put("Image","ion-img");
        Jsx2ionicMap.put("</Image>","</ion-img>");
        Jsx2ionicMap.put("SafeAreaView","div");
    }
    public void addNewTagwithStartMapping(String source,String Target)
    {
        Jsx2ionicMap.put(source,Target);
    }
        public void addNewTagMapping(String source,String Target)
    {
        Jsx2ionicMap.put(source,Target);
        Jsx2ionicMap.put("</"+source+">","</"+Target+">");
    }
    public  String getTagMapping(String source)
    {
        if(Jsx2ionicMap.containsKey(source))
        {
            return Jsx2ionicMap.get(source);
        }
        return source;
    }
    public boolean ContainsMapping(String source)
    {
        return Jsx2ionicMap.containsKey(source);
    }

}

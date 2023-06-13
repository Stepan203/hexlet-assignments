package exercise;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

// BEGIN
public class SingleTag extends Tag {
    //  public String name;
    public Map<String, String> maps;

    public SingleTag(String tag, Map<String, String> maps) {
        super(tag);
        this.maps = maps;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }


    @java.lang.Override
    public java.lang.String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<"); // начало тэга
        sb.append(getTag()); // имя тэга
        sb.append(" "); // чтобы имя с атрибутами не склеилось
        for (Map.Entry<String, String> entry: maps.entrySet()) {
            sb.append(entry.getKey()); //выводишь название атрибута
            sb.append("=");
            sb.append("\"" + entry.getValue() + "\""); // вывод значения атрибута
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(">");
        return sb.toString();
    }
}
// END

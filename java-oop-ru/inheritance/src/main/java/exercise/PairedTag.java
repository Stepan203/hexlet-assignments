package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
  //  public String namePaire;
    public Map<String, String> mapsPaire;
    public String telo;
    public List listTag;

    public PairedTag(String tag, Map<String, String> mapsPaire, String telo, List listTag) {
        super(tag);
        this.mapsPaire = mapsPaire;
        this.telo = telo;
        this.listTag = listTag;
    }

    public Map<String, String> getMapsPaire() {
        return mapsPaire;
    }

    public void setMapsPaire(Map<String, String> mapsPaire) {
        this.mapsPaire = mapsPaire;
    }

    public String getTelo() {
        return telo;
    }

    public void setTelo(String telo) {
        this.telo = telo;
    }

    public List getListTag() {
        return listTag;
    }

    public void setListTag(List listTag) {
        this.listTag = listTag;
    }

    @java.lang.Override
    public java.lang.String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<"); // начало тэга
        sb.append(getTag()); // имя тэга
        sb.append(" "); // чтобы имя с атрибутами не склеилось
        for (Map.Entry<String, String> entry: mapsPaire.entrySet()) {
            sb.append(entry.getKey()); //выводишь название атрибута
            sb.append("=");
            sb.append("\"" + entry.getValue() + "\""); // вывод значения атрибута
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(">");
        sb.append(telo);
        if (listTag.size() != 0) {
            sb.append(listTag.get(0));
            sb.append(listTag.get(1));
        }
        sb.append("</");
        sb.append(getTag());
        sb.append(">");

        return sb.toString();
    }
}
// END

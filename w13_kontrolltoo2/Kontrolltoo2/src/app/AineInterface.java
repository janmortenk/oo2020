package app;

import java.util.List;

public interface AineInterface {
    public String getName();
    public int getmolekulMass();
    public int arvutaMass(List<Ioon> Ioonid);
    public int kontrolliLaengud(List<Ioon> Ioonid);
    public String createName(List<Ioon> Ioonid);
}

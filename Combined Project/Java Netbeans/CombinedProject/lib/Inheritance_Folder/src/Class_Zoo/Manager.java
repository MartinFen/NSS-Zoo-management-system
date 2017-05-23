package Class_Zoo;


import java.sql.Date;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.EC0F4A39-B857-3E63-6153-CA10424E4703]
// </editor-fold> 
public class Manager extends Staff {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.10B557F9-3F53-FF0C-5F6C-1E2B13BD0F02]
    // </editor-fold> 
    private String Manager_ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.45C6D688-1C3B-9C80-DFA7-9AA61113081C]
    // </editor-fold> 
    private String Staff_ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0DCC650A-5E22-E944-FC6C-C02E3B959ED5]
    // </editor-fold> 
    private String Area_ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D55D8F39-2F30-B705-BFD1-BD91E7FF5CB6]
    // </editor-fold> 
    private String Managing_Area;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CC39F0DC-888E-4995-2101-A09AE0F3A476]
    // </editor-fold> 
    private int Experience;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3221B155-1B88-9875-063F-1D614728A87C]
    // </editor-fold> 
    private String General_Manager;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.505CD023-1A20-ED3D-E238-0116F7D7751F]
    // </editor-fold> 
    public Manager () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CCF209FF-9A80-6C05-DE2E-480D6DBA8BCC]
    // </editor-fold> 
    public String getArea_ID () {
        return Area_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F592B7C8-912B-AA3D-0363-BE3DC2EA66DB]
    // </editor-fold> 
    public void setArea_ID (String val) {
        this.Area_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5A8CFE86-C67A-1FA9-33F4-61232F0F60F3]
    // </editor-fold> 
    public int getExperience () {
        return Experience;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DFB8781B-6432-B24A-1C27-0F962776EAC8]
    // </editor-fold> 
    public void setExperience (int val) {
        this.Experience = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.970829CC-A41A-6F4E-D554-ADB53FD46D4C]
    // </editor-fold> 
    public String getGeneral_Manager () {
        return General_Manager;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3800F6C2-91A3-4B65-CED7-1A4CA7BE154B]
    // </editor-fold> 
    public void setGeneral_Manager (String val) {
        this.General_Manager = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.41998E54-EBBF-976C-8A4B-45B38E790C80]
    // </editor-fold> 
    public String getManager_ID () {
        return Manager_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A904386F-51D7-F251-3892-523E51552B55]
    // </editor-fold> 
    public void setManager_ID (String val) {
        this.Manager_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6349BF3B-147D-8EA1-B604-905564888F5C]
    // </editor-fold> 
    public String getManaging_Area () {
        return Managing_Area;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E8ADB966-5FEE-61A6-9CEB-5A11ADA3758A]
    // </editor-fold> 
    public void setManaging_Area (String val) {
        this.Managing_Area = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D347C6AC-40FE-A5C1-ABAE-7947A162A65C]
    // </editor-fold> 
    public String getStaff_ID () {
        return Staff_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.61504C5B-6BAB-B2A2-B3B3-691E5A0A5C51]
    // </editor-fold> 
    public void setStaff_ID (String val) {
        this.Staff_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8F10D3D2-6B47-4AA5-F8EC-247BDC6CD21C]
    // </editor-fold> 
    public String getName () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1CA29EAB-2366-4C59-121C-D91947C7DA35]
    // </editor-fold> 
    public void setName (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.45A1C89A-7EEC-DC47-1FB9-BEA5BD7E51B0]
    // </editor-fold> 
    public String getTitle () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4C54528C-4D2A-0E8E-3C39-24A9C35249EB]
    // </editor-fold> 
    public void setTitle (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.35EB693D-5061-FA5B-73B6-92074175B24F]
    // </editor-fold> 
    public String getGender () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BFA15936-C59C-0130-3B01-F5CCA7034393]
    // </editor-fold> 
    public void setGender (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5BC4984E-5EDF-5A9C-74D0-AE3014E86649]
    // </editor-fold> 
    public String getPPS_no () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C4B4D0D3-28EA-A671-7542-D7618FC01622]
    // </editor-fold> 
    public void setPPS_no (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.81ACF88C-2A75-3888-C743-F42A43BB1A73]
    // </editor-fold> 
    public Date getDOB () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.02376D0E-CAFC-7256-E658-893A4CED194B]
    // </editor-fold> 
    public void setDOB (Date val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.204F8DDF-181D-EAD0-D0EC-424BF14BA8AC]
    // </editor-fold> 
    public Date getStart_of_Employment () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.71CBF33F-7C05-E7C0-5C2A-66B827DAD5D1]
    // </editor-fold> 
    public void setStart_of_Employment (Date val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1BEF4FAB-3F39-B45A-464B-B1D2B9121A41]
    // </editor-fold> 
    public int getContact_Number () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C50BDDCD-F59E-73E9-CA4B-3625195C322D]
    // </editor-fold> 
    public void setContact_Number (int val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9408CD3E-7324-FC60-CBB6-A2BBB514C193]
    // </editor-fold> 
    public double getSalary () {
        return 0.0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8B91C02A-87B9-80D1-87D4-5B581B6F18CC]
    // </editor-fold> 
    public void setSalary (double val) {
    }

}


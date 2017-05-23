package inheritance_folder;
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
    private int Managing_Experience;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3221B155-1B88-9875-063F-1D614728A87C]
    // </editor-fold> 
    private String General_Manager;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FFBDC291-A208-E001-ED99-973AD4F56475]
    // </editor-fold> 
    private String Admin_Privlages;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.505CD023-1A20-ED3D-E238-0116F7D7751F]
    // </editor-fold> 
    public Manager () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CCF209FF-9A80-6C05-DE2E-480D6DBA8BCC]
    // </editor-fold> 
    public String getArea_ID () {
        return Area_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F592B7C8-912B-AA3D-0363-BE3DC2EA66DB]
    // </editor-fold> 
    public void setArea_ID (String val) {
    this.Area_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.970829CC-A41A-6F4E-D554-ADB53FD46D4C]
    // </editor-fold> 
    public String getGeneral_Manager () {
        return General_Manager;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3800F6C2-91A3-4B65-CED7-1A4CA7BE154B]
    // </editor-fold> 
    public void setGeneral_Manager (String val) {
        this.General_Manager = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.41998E54-EBBF-976C-8A4B-45B38E790C80]
    // </editor-fold> 
    public String getManager_ID () {
        return Manager_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A904386F-51D7-F251-3892-523E51552B55]
    // </editor-fold> 
    public void setManager_ID (String val) {
        this.Manager_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6349BF3B-147D-8EA1-B604-905564888F5C]
    // </editor-fold> 
    public String getManaging_Area () {
        return Managing_Area;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E8ADB966-5FEE-61A6-9CEB-5A11ADA3758A]
    // </editor-fold> 
    public void setManaging_Area (String val) {
        this.Managing_Area = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D347C6AC-40FE-A5C1-ABAE-7947A162A65C]
    // </editor-fold> 
    public String getStaff_ID () {
        return Staff_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.61504C5B-6BAB-B2A2-B3B3-691E5A0A5C51]
    // </editor-fold> 
    public void setStaff_ID (String val) {
      this.Staff_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.204B6FBB-CE39-1F71-2294-ACD0019D413F]
    // </editor-fold> 
    public String getAdmin_Privlages () {
        return Admin_Privlages;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A982015D-89FD-E0BE-F090-5DDF9DCC38A8]
    // </editor-fold> 
    public void setAdmin_Privlages (String val) {
        this.Admin_Privlages = val;
    }

    public int getManaging_Experience () {
        return Managing_Experience;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.A982015D-89FD-E0BE-F090-5DDF9DCC38A8]
    // </editor-fold>
    public void setManaging_Experience (int val) {
        this.Managing_Experience = val;
    }

}


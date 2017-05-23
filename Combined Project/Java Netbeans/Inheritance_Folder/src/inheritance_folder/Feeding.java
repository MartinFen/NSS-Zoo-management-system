package inheritance_folder;

import java.sql.Date; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.FAA92A95-2FE6-DA7F-B4F8-134C86730340]
// </editor-fold> 
public class Feeding extends Staff {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0C307505-CD1A-4069-C116-36A70D4EE31B]
    // </editor-fold> 
    private String General_Staff_ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CF94FD95-5525-6258-1EC4-18434B568A31]
    // </editor-fold> 
    private String Staff_ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.89FF520B-7EF7-B4C2-1C40-9FBE019C87F8]
    // </editor-fold> 
    private String Area_ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CE6B99BB-37B7-0D75-423A-98606B5B7BA4]
    // </editor-fold> 
    private String Working_Area;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8F50F1AD-79B9-69E0-314C-C3560118480C]
    // </editor-fold> 
    private String Job_Title;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ECC4C68B-1D64-35B1-8900-C5C5AFD99CA6]
    // </editor-fold> 
    public Feeding () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AEC08F2B-D4BB-DC53-6AA4-EEDE34E11185]
    // </editor-fold> 
    public String getArea_ID () {
        return Area_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.403C4739-CA48-BA6A-3FE8-557BFAA8AF4C]
    // </editor-fold> 
    public void setArea_ID (String val) {
    this.Area_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F258D187-B2CB-E630-D0C3-FD3B0F531DFE]
    // </editor-fold> 
    public String getGeneral_Staff_ID () {
        return General_Staff_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.74F617E1-86F6-7BEB-0BDC-FA701813D05E]
    // </editor-fold> 
    public void setGeneral_Staff_ID (String val) {
    this.General_Staff_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.18AB2A31-1B03-B1EE-1678-5B629AEA0E48]
    // </editor-fold> 
    public String getStaff_ID () {
        return Staff_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A3753FB9-B583-A37B-2371-11E15A564C12]
    // </editor-fold> 
    public void setStaff_ID (String val) {
    this.Staff_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F095A300-648A-017E-2F62-4C445558FA9B]
    // </editor-fold> 
    public String getWorking_Area () {
        return Working_Area;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.429C2764-42E8-F901-80FD-88E61CFC121B]
    // </editor-fold> 
    public void setWorking_Area (String val) {
    this.Working_Area = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FCEF85FE-2A58-20FA-A279-FEC48EF3641E]
    // </editor-fold> 
    public String getJob_Title () {
        return Job_Title;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5FA4BA54-B31C-C8F4-2432-56DFA798AC6F]
    // </editor-fold> 
    public void setJob_Title (String val) {
        this.Job_Title = val;
    }

}


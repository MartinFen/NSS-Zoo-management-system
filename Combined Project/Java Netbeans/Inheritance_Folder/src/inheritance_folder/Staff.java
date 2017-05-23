package inheritance_folder;
// #[regen=yes,id=DCE.D99348CC-BF15-17EA-E38E-85FF1C51E6E8]
// </editor-fold> 
public class Staff {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8343DE60-6F8E-0F28-FCEE-DAB0406AF8A8]
    // </editor-fold> 
    private String Staff_ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.97306544-15DD-8404-7181-96C8FC0F6171]
    // </editor-fold> 
    private String Name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F334292B-D1B2-CA37-473E-2C04D7DE5E6D]
    // </editor-fold> 
    private String Gender;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.09D95A48-C842-662C-8D4B-FBA542DECD95]
    // </editor-fold> 
    private String PPS_no;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4D4A2C62-6406-A4AD-2660-D058837213EA]
    // </editor-fold> 
    private String DOB;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BEAFF7D9-1E6F-EA39-DBD4-51CA1F146513]
    // </editor-fold> 
    private String Start_Of_Employment;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EB376756-0DD7-C186-980A-EA0AF9C92D55]
    // </editor-fold> 
    private int Contact_Number;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.07FF5EE3-0A8F-A229-AA82-CF2B6CFE0371]
    // </editor-fold> 
    private double Salary;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2D5A1138-09B5-BD91-0ACD-63BE8AFE664B]
    // </editor-fold> 
    private String Address;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E75922AB-E1C5-605D-D84D-8A1AF5005B9B]
    // </editor-fold> 
    private String Email;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9A573478-68C2-B7B8-7093-1BAD996535D8]
    // </editor-fold> 
    public Staff () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FAF6DC21-38D1-150F-37F4-748462CAD3E2]
    // </editor-fold> 
    public int getContact_Number () {
    return Contact_Number;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.86C4CD1E-FC7D-4F5F-1168-0B1EB62BA7CC]
    // </editor-fold> 
    public void setContact_Number (int val) 
    {
    this.Contact_Number = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1D26E451-CB97-9BAF-3B3E-3D26C0E503A5]
    // </editor-fold> 
    public String getDOB ()
    {
    return DOB;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.32DB4BAF-354B-002A-A8F9-DC3C8D60976F]
    // </editor-fold> 
    public void setDOB (String val)
    {
    this.DOB = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.941EAFE3-514D-205A-E45B-E67EBB940699]
    // </editor-fold> 
    public String getGender ()
    {
    return Gender;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5EB583BA-4408-9780-DF33-250D78801A0A]
    // </editor-fold> 
    public void setGender (String val) 
    {
    this.Gender = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C921BFFA-E727-7576-9539-FDE84408CCCB]
    // </editor-fold> 
    public String getName ()
    {
    return Name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BA0AE10C-E4B8-1C7E-3C2C-0A817725B680]
    // </editor-fold> 
    public void setName (String val) 
    {
    this.Name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8543AB18-3C61-7C36-D686-6F003440F437]
    // </editor-fold> 
    public String getPPS_no ()
    {
    return PPS_no;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9E3ACB36-1E34-71A9-72B3-94BB7D4EEB5D]
    // </editor-fold> 
    public void setPPS_no (String val) 
    {
    this.PPS_no = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0794D5C6-EE06-E8D8-9D77-F5F944BD7EA7]
    // </editor-fold> 
    public double getSalary ()
    {
    return Salary;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.05AEEE5D-569E-8E16-1E84-ECA1C48C5027]
    // </editor-fold> 
    public void setSalary (double val) 
    {
    this.Salary = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7CCEE975-0D42-7610-7A20-4F505F4467D7]
    // </editor-fold> 
    public String getStaff_ID ()
    {
    return Staff_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7864EF48-6DD0-7E10-6E9C-E84727939B80]
    // </editor-fold> 
    public void setStaff_ID (String val) 
    {
    this.Staff_ID= val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9619477E-CC4E-48AD-27F0-91F8565AD601]
    // </editor-fold> 
    public String getStart_of_Employment ()
    {
    return Start_Of_Employment;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3ADDCDCC-DF04-8429-3053-22FB643F9203]
    // </editor-fold> 
    public void setStart_of_Employment (String val)
    {
    this.Start_Of_Employment = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6A072037-8178-7A51-D239-E76DD9BEA4E1]
    // </editor-fold> 
    public String getAddress ()
    {
    return Address;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3841EE7B-B3BD-21AE-6CD1-7606842C9D0F]
    // </editor-fold> 
    public void setAddress (String val)
    {
    this.Address = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.972335A4-D34E-6C86-9A02-9C729A2095F9]
    // </editor-fold> 
    public String getEmail ()
    {
    return Email;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A1F32D1F-914B-D0E2-0CEA-DC93567AF4A0]
    // </editor-fold> 
    public void setEmail (String val) {
    this.Email = val;
    }

}


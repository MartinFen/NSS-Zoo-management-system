package Class_Zoo;


import java.sql.Date;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.5B167172-2100-DA41-2FB8-7CE6B90F4B47]
// </editor-fold> 
public class Animal {



    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3F87AE27-240C-0590-CCC8-3178455EF0F8]
    // </editor-fold> 
    private String Animal_ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8FBA98E5-421F-841C-06F9-8BB20412F9D1]
    // </editor-fold> 
    private String Animal_Name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0AC6382C-A33A-0B17-5349-0FB05DB14F06]
    // </editor-fold> 
    private String Animal_Type;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A87A318D-3262-6976-CAD2-4C425684CE48]
    // </editor-fold> 
    private String Gender;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C7F93AEA-59BB-6EAE-32AD-192786EC484C]
    // </editor-fold> 
    private Date DOB;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F30DB055-82C4-E274-A99A-8A7A7384972C]
    // </editor-fold> 
    private Date Reg_Date;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.35D5F620-C18D-6AE8-2604-AD625013F67D]
    // </editor-fold> 
    private String Diet_Type;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.52B2E1FF-EE69-0A7C-6E86-E71E2AF630AC]
    // </editor-fold> 
    private String Diet;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DB539E7D-0D38-CC12-0DC9-C77DB4025499]
    // </editor-fold> 
    private String Status;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0ABB77AE-6457-2ACA-0E97-1903F62C5939]
    // </editor-fold> 
    private String Health;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8A9D85E6-8EE6-B543-D6C2-E45065BF5FB4]
    // </editor-fold> 
    private int Space_Required_Acres;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7FC65E47-98BC-5238-E980-832AD58F1FB1]
    // </editor-fold> 
    public Animal () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6AB35107-9F0C-C7B8-5599-2A40383D23C7]
    // </editor-fold> 
    public String getAnimal_ID () {
        return Animal_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8E2106EE-2E51-DDBB-A0B8-060890DE4DDE]
    // </editor-fold> 
    public void setAnimal_ID (String val) {
        this.Animal_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.93D52670-2533-F74D-A751-4E429C5F51D2]
    // </editor-fold> 
    public String getAnimal_Name () {
        return Animal_Name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.20699775-480B-DE00-1010-C1BA120FBE69]
    // </editor-fold> 
    public void setAnimal_Name (String val) {
        this.Animal_Name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.301F6B8D-9816-040D-946E-5519D0645626]
    // </editor-fold> 
    public String getAnimal_Type () {
        return Animal_Type;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6C3B33D3-6F60-3A95-01E0-2EA9229C0E2D]
    // </editor-fold> 
    public void setAnimal_Type (String val) {
        this.Animal_Type = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.46D4B54A-4958-6E62-2E37-802B8B59928C]
    // </editor-fold> 
    public Date getDOB () {
        return DOB;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AAD92FEA-9281-4BC5-2926-147D8AD8A317]
    // </editor-fold> 
    public void setDOB (Date val) {
        this.DOB = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AF8C6D96-1127-30D4-E4DC-77760CB1A327]
    // </editor-fold> 
    public String getDiet () {
        return Diet;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.08331306-2C02-6583-CCFD-BAF5D00891FF]
    // </editor-fold> 
    public void setDiet (String val) {
        this.Diet = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3BA6B9F7-3B37-29B9-A3A5-0DA2E4371708]
    // </editor-fold> 
    public String getDiet_Type () {
        return Diet_Type;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.36955AC6-254E-FE84-A331-0B2BD91F2018]
    // </editor-fold> 
    public void setDiet_Type (String val) {
        this.Diet_Type = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.259AF83D-1CC8-2660-360C-C52944F2F489]
    // </editor-fold> 
    public String getGender () {
        return Gender;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FA5A6AB8-6F17-05E0-DF5F-E57E5CF9B9ED]
    // </editor-fold> 
    public void setGender (String val) {
        this.Gender = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D5E7AB1A-CFFF-4BE8-028C-07EF3E98FDB1]
    // </editor-fold> 
    public String getHealth () {
        return Health;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1C89653B-EA6B-AA3D-C395-A5B75395347D]
    // </editor-fold> 
    public void setHealth (String val) {
        this.Health = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.345C72E6-80E5-6626-6EF9-A1925DEF5394]
    // </editor-fold> 
    public Date getReg_Date () {
        return Reg_Date;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.24AE2F17-B43D-3BE1-A834-6BB664040C5F]
    // </editor-fold> 
    public void setReg_Date (Date val) {
        this.Reg_Date = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A78CB8EC-EA39-D15B-7051-0FDB021D0E06]
    // </editor-fold> 
    public int getSpace_Required_Acres () {
        return Space_Required_Acres;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.926C1D60-D87F-BB10-8103-3188B60FFF38]
    // </editor-fold> 
    public void setSpace_Required_Acres (int val) {
        this.Space_Required_Acres = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.81ACDE1F-53C9-3724-8072-FFDE33BD02B9]
    // </editor-fold> 
    public String getStatus () {
        return Status;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6B585BD5-FF43-0A24-A3C0-984FF985FECE]
    // </editor-fold> 
    public void setStatus (String val) {
        this.Status = val;
    }

}


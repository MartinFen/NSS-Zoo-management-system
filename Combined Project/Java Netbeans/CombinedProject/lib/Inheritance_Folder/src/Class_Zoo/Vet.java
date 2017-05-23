package Class_Zoo;


import java.sql.Date;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E5F2B2B1-A98D-892D-A319-958717B6AB4C]
// </editor-fold> 
public class Vet extends Staff {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.51BBA32E-D6AA-24D7-D277-0F8C2DD99157]
    // </editor-fold> 
    private String Vet_ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C9452D3D-48E1-A707-A98F-37BE93624D4D]
    // </editor-fold> 
    private String Staff_ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.35FD0545-72B9-FB37-871D-9BC9C6A62737]
    // </editor-fold> 
    private String Head_Vet;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.86CF91B2-4621-AD1B-0B7A-412C7902C3A7]
    // </editor-fold> 
    private String Speciality;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C30524BF-98AF-6415-2EDF-9207BBD1DDAF]
    // </editor-fold> 
    private String On_Call;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3D892E8B-C0E0-7D80-05D6-C3187DE336E4]
    // </editor-fold> 
    private int Experience;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4D652C2C-28FF-8033-9582-5A9729B0509C]
    // </editor-fold> 
    public Vet () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.769934B6-209A-4635-5CDE-07AF5A5C52E0]
    // </editor-fold> 
    public int getExperience () {
        return Experience;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1CC9F606-B6FB-FDDF-29C5-4CB6B22C42B1]
    // </editor-fold> 
    public void setExperience (int val) {
        this.Experience = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.91CDCF79-3075-1B8B-17DA-D9A00B29DC0F]
    // </editor-fold> 
    public String getHead_Vet () {
        return Head_Vet;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.23133047-4144-169D-72F1-0D7F825C0481]
    // </editor-fold> 
    public void setHead_Vet (String val) {
        this.Head_Vet = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C24DC271-CDF7-12BF-8369-908256A7332E]
    // </editor-fold> 
    public String getOn_Call () {
        return On_Call;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9159CEE4-FAB2-821A-08DF-AAFD0B671BAE]
    // </editor-fold> 
    public void setOn_Call (String val) {
        this.On_Call = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.82060528-EE38-DC64-7F4B-C2B0B6A37D20]
    // </editor-fold> 
    public String getSpeciality () {
        return Speciality;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E28FD77F-A29D-56AA-A8EE-9207F1179E2F]
    // </editor-fold> 
    public void setSpeciality (String val) {
        this.Speciality = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A7DD7759-A96F-5D3D-9A54-ED47A40569E8]
    // </editor-fold> 
    public String getStaff_ID () {
        return Staff_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.58F22E92-57DB-D5B7-265C-5AA5F9E02D26]
    // </editor-fold> 
    public void setStaff_ID (String val) {
        this.Staff_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9AAA23CA-4DF5-FDA2-46BF-588DB54C87C9]
    // </editor-fold> 
    public String getVet_ID () {
        return Vet_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AB5728B8-8AC8-5DE4-C531-E0419FA6A2A3]
    // </editor-fold> 
    public void setVet_ID (String val) {
        this.Vet_ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5C95095D-C214-5ADA-A221-8AE3B866A6C4]
    // </editor-fold> 
    public String getName () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.403416C6-E900-7256-CB2F-CB356C4A1705]
    // </editor-fold> 
    public void setName (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E138670A-A2F7-75AD-3475-7A3363786C69]
    // </editor-fold> 
    public String getTitle () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EB668596-4099-87CE-011F-2544726BE8BF]
    // </editor-fold> 
    public void setTitle (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9401F194-189B-1049-4105-36CA5F4F6809]
    // </editor-fold> 
    public String getGender () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.924A6BDB-D969-E697-4B5A-925D55D98D12]
    // </editor-fold> 
    public void setGender (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DDDECB19-D22F-6074-14B4-AAFDC2773A11]
    // </editor-fold> 
    public String getPPS_no () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6CC0D086-A7AF-2B0E-B736-8E315C8275D0]
    // </editor-fold> 
    public void setPPS_no (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D47D3C10-7B9F-8A56-19CC-B5FA0061C858]
    // </editor-fold> 
    public Date getDOB () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AC8052EB-ED13-DEAA-6F5F-6A11255CE41D]
    // </editor-fold> 
    public void setDOB (Date val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.25D45266-5C3C-A046-4E96-19CAC645FF36]
    // </editor-fold> 
    public Date getStart_of_Employment () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9C3CA5A5-748B-85FE-41B5-0BB1281CFF1F]
    // </editor-fold> 
    public void setStart_of_Employment (Date val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9403046A-6CDB-807A-2A51-45837DE6AA1F]
    // </editor-fold> 
    public int getContact_Number () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2F5ACA45-D685-7C50-D494-23DB56B757DE]
    // </editor-fold> 
    public void setContact_Number (int val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.004E5C4F-D1F9-DA2A-CDE8-5072E54A94E3]
    // </editor-fold> 
    public double getSalary () {
        return 0.0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8251895E-6108-6D70-B96C-54D104A00041]
    // </editor-fold> 
    public void setSalary (double val) {
    }

}


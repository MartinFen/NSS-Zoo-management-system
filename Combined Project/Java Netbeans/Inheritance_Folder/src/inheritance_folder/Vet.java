package inheritance_folder;

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
    private int Vetniery_Experience;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5953866E-AB13-0E76-5B76-3AD1ABE34FD1]
    // </editor-fold> 
    private String Contractor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.90C19F8F-64B9-81D7-1C5F-3C3C23AA33CF]
    // </editor-fold> 
    private String Admin_Privilages;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4D652C2C-28FF-8033-9582-5A9729B0509C]
    // </editor-fold> 
    public Vet () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.769934B6-209A-4635-5CDE-07AF5A5C52E0]
    // </editor-fold> 
    public int getVetniery_Experience () {
        return Vetniery_Experience;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1CC9F606-B6FB-FDDF-29C5-4CB6B22C42B1]
    // </editor-fold> 
    public void setVetniery_Experience (int val) {
    this.Vetniery_Experience = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.91CDCF79-3075-1B8B-17DA-D9A00B29DC0F]
    // </editor-fold> 
    public String getHead_Vet () {
        return Head_Vet;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.23133047-4144-169D-72F1-0D7F825C0481]
    // </editor-fold> 
    public void setHead_Vet (String val) {
    this.Head_Vet = val;}

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C24DC271-CDF7-12BF-8369-908256A7332E]
    // </editor-fold> 
    public String getOn_Call () {
        return On_Call;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9159CEE4-FAB2-821A-08DF-AAFD0B671BAE]
    // </editor-fold> 
    public void setOn_Call (String val) {
    this.On_Call = val;}

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.82060528-EE38-DC64-7F4B-C2B0B6A37D20]
    // </editor-fold> 
    public String getSpeciality () {
        return Speciality;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E28FD77F-A29D-56AA-A8EE-9207F1179E2F]
    // </editor-fold> 
    public void setSpeciality (String val) {
    this.Speciality = val;}

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A7DD7759-A96F-5D3D-9A54-ED47A40569E8]
    // </editor-fold> 
    public String getStaff_ID () {
        return Staff_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.58F22E92-57DB-D5B7-265C-5AA5F9E02D26]
    // </editor-fold> 
    public void setStaff_ID (String val) {
    this.Staff_ID = val;}

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9AAA23CA-4DF5-FDA2-46BF-588DB54C87C9]
    // </editor-fold> 
    public String getVet_ID () {
        return Vet_ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AB5728B8-8AC8-5DE4-C531-E0419FA6A2A3]
    // </editor-fold> 
    public void setVet_ID (String val) {
    this.Vet_ID = val;}

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FD20EF20-53FA-6AD3-B26D-AEC1791CEA2C]
    // </editor-fold> 
    public String getAdmin_Privilages () {
        return Admin_Privilages;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A1E49F0B-0BC9-B092-FB0D-463F120EA96A]
    // </editor-fold> 
    public void setAdmin_Privilages (String val) {
        this.Admin_Privilages = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AD819F88-E7D8-DDCA-45EE-018E8048CABB]
    // </editor-fold> 
    public String getContractor () {
        return Contractor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E831254A-67AA-85DE-C8FC-68C66E84EC25]
    // </editor-fold> 
    public void setContractor (String val) {
        this.Contractor = val;
    }

}


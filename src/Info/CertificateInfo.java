package Info;

public class CertificateInfo implements Certificates {

    String certificateName="";
    String year="";
    String givenOrganisation="";
    Certificates nextCertificate=null;

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setGivenOrganisation(String givenOrganisation) {
        this.givenOrganisation = givenOrganisation;
    }

    public void setNextCertificate(Certificates nextCertificate) {
        this.nextCertificate = nextCertificate;
    }
}
package Info;

public interface Reference {

    void setName(String name);
    void setLastname(String lastname);
    void setTelNo(String telNo);
    void setMailAddress(String mailAddress);

    void setNextReferenceInfo(Reference nextReferenceInfo);
}
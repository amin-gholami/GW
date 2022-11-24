package ir.bankid.common.util;

public class SMSEnginePattern {
    private String phoneNo;
    private String Param1;
    private String trackId;

    public SMSEnginePattern(String phoneNo, String param1, String trackId) {
        this.phoneNo = '"'+phoneNo+'"';
        this.Param1 = '"'+param1+'"';
        this.trackId = '"'+trackId+'"';
    }

    public String getPattern(){
        return "<UidMessage PhoneNo="+this.phoneNo+" Param1="+this.Param1+" trackId="+this.trackId+"/>";
    }
}

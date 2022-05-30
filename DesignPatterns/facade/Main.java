package design.facade;

public class Main {
    public static void main(String[] args) {
        FTP ftpClient = new FTP("www.foo.co.kr", 22,"/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.fileWrite();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisConnect();
        writer.fileDisconnect();

        ftpClient.disConnect();

        //facade pattern
        SFTPClient sftpClient = new SFTPClient("www.foo.co.kr", 22,"/home/etc","text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
    }
}

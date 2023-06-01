public class Client {
    public static void main(String[] args) {
       // creating the receiver
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // create the command with the associate receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        // creating the invoker and associate it with a command
        FileInvoker file = new FileInvoker(openFileCommand);

        // perform action on the invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
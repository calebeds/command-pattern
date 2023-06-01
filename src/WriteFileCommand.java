public class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    // store previous state for undo, String someState


    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}

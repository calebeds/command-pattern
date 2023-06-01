public class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    // store previous state for undo, String someState


    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}

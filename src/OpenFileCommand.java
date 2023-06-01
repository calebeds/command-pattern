public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    // store previous state for undo, String someState


    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // save previous state, in case undo called someState = ..... .;
        this.fileSystemReceiver.openFile();
    }
}

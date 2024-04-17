import java.io.File;

class FileOrDirectoryChecker {
    public static void main(String[] args) {
        // Check if the correct number of arguments are provided
        if (args.length != 1) {
            System.err.println("Usage: java FileOrDirectoryChecker <filename or directory>");
            return;
        }

        String name = args[0];
        File fileOrDir = new File(name);

        if (fileOrDir.isFile()) {
            // If it's a file, print its size
            System.out.println("File size: " + fileOrDir.length() + " bytes");
        } else if (fileOrDir.isDirectory()) {
            // If it's a directory, list all files in it
            File[] files = fileOrDir.listFiles();
            if (files != null) {
                System.out.println("Files in the directory:");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.err.println("Error: Could not list files in the directory.");
            }
        } else {
            System.err.println("Error: " + name + " is neither a file nor a directory.");
        }
    }
}

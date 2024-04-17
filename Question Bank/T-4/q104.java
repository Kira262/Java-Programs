import java.io.File;

class DirectoryCreatorAndLister {
    public static void main(String[] args) {
        // Define the directory path
        String directoryPath = "/home/abc/bcd/def/ghi/jkl";

        // Create the directories
        File directory = new File(directoryPath);
        boolean success = directory.mkdirs();
        if (success) {
            System.out.println("Directories created successfully.");
        } else {
            System.err.println("Failed to create directories.");
            return;
        }

        // List files and directories
        listFilesAndDirectories(directory);
    }

    private static void listFilesAndDirectories(File directory) {
        System.out.println("Listing files and directories in: " + directory.getAbsolutePath());
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                String type = file.isDirectory() ? "Directory" : "File";
                String permissions = getPermissions(file);
                String fileSize = file.isFile() ? String.valueOf(file.length()) + " bytes" : "-";
                System.out.println(type + " - " + file.getName() + " - " + fileSize + " - " + permissions);
            }
        } else {
            System.err.println("Error: Could not list files and directories.");
        }
    }

    private static String getPermissions(File file) {
        StringBuilder permissions = new StringBuilder();
        if (file.canRead()) {
            permissions.append("r");
        } else {
            permissions.append("-");
        }
        if (file.canWrite()) {
            permissions.append("w");
        } else {
            permissions.append("-");
        }
        if (file.canExecute()) {
            permissions.append("x");
        } else {
            permissions.append("-");
        }
        return permissions.toString();
    }
}

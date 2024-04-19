class InvalidStatusValueException extends Exception {
    public InvalidStatusValueException(String message) {
        super(message);
    }
}

class OccupiedResourcesExceededException extends Exception {
    public OccupiedResourcesExceededException(String message) {
        super(message);
    }
}

class ResourcesStatus {
    private int[][] statusRef;

    // Constructor to initialize the status array
    public ResourcesStatus(int[][] statusRef) {
        this.statusRef = statusRef;
    }

    // Method to process and display status count
    public void processStatusCount() throws OccupiedResourcesExceededException {
        int freeCount = 0, occupiedCount = 0, inaccessibleCount = 0;

        // Iterate through the status array to count different statuses
        for (int[] row : statusRef) {
            for (int status : row) {
                switch (status) {
                    case 0:
                        freeCount++;
                        break;
                    case 1:
                        occupiedCount++;
                        break;
                    case 2:
                        inaccessibleCount++;
                        break;
                    default:
                        throw new OccupiedResourcesExceededException("Invalid status value.");
                }
            }
        }

        // Check if occupied resources exceed free resources
        if (occupiedCount > freeCount) {
            throw new OccupiedResourcesExceededException("Occupied resources exceed free resources.");
        }

        // Display status counts
        System.out.println("Total free resources: " + freeCount);
        System.out.println("Total occupied resources: " + occupiedCount);
        System.out.println("Total inaccessible resources: " + inaccessibleCount);
    }

    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Usage: java ResourcesStatus <status1> <status2> ... <status9>");
            return;
        }

        int[][] statusArray = new int[3][3];
        int index = 0;

        // Populate the status array with command line arguments
        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int status = Integer.parseInt(args[index]);
                    if (status < 0 || status > 2) {
                        throw new InvalidStatusValueException("Invalid status value: " + status);
                    }
                    statusArray[i][j] = status;
                    index++;
                }
            }

            // Create an instance of ResourcesStatus
            ResourcesStatus resourcesStatus = new ResourcesStatus(statusArray);

            // Process and display status count
            try {
                resourcesStatus.processStatusCount();
            } catch (OccupiedResourcesExceededException e) {
                // Handle OccupiedResourcesExceededException by marking all inaccessible
                // resources as free
                System.out.println(e.getMessage());
                resourcesStatus.markInaccessibleAsFree();
                System.out.println("All inaccessible resources are marked as free.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please provide integer values for status.");
        } catch (InvalidStatusValueException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to mark inaccessible resources as free
    public void markInaccessibleAsFree() {
        for (int i = 0; i < statusRef.length; i++) {
            for (int j = 0; j < statusRef[i].length; j++) {
                if (statusRef[i][j] == 2) {
                    statusRef[i][j] = 0;
                }
            }
        }
    }
}

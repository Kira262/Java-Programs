import java.util.PriorityQueue;
import java.util.Scanner;

class Team {
    String name;
    int wins;
    int losses;

    public Team(String name, int wins, int losses) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
    }

    public double winPercentage() {
        return (double) wins / (wins + losses);
    }

    @Override
    public String toString() {
        return name;
    }
}

class SportsTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Team> teams = new PriorityQueue<>((t1, t2) -> {
            double winPercentage1 = t1.winPercentage();
            double winPercentage2 = t2.winPercentage();
            if (winPercentage1 == winPercentage2) {
                return Integer.compare(t2.wins, t1.wins); // Higher wins have higher priority
            }
            return Double.compare(winPercentage2, winPercentage1); // Higher win percentage has higher priority
        });

        System.out.println("Enter the number of teams:");
        int numTeams = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter team names and their win-loss records (e.g., TeamName Wins Losses):");
        for (int i = 0; i < numTeams; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int wins = Integer.parseInt(input[1]);
            int losses = Integer.parseInt(input[2]);
            teams.offer(new Team(name, wins, losses));
        }

        while (teams.size() >= 2) {
            Team team1 = teams.poll();
            Team team2 = teams.poll();
            System.out.println("Match: " + team1 + " vs " + team2);
            // Simulate match and update win-loss records if needed
        }

        scanner.close();
    }
}

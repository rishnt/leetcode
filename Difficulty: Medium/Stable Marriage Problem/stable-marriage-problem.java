class Solution {
    public int[] stableMarriage(int[][] men, int[][] women) {
        // code here
          int n = men.length;

    int[] womanPartner = new int[n];   // woman -> man
    int[] manPartner = new int[n];     // man -> woman
    int[] nextProposal = new int[n];   // next woman index to propose

    Arrays.fill(womanPartner, -1);
    Arrays.fill(manPartner, -1);

    // Create ranking for women
    int[][] rank = new int[n][n];
    for (int w = 0; w < n; w++) {
        for (int i = 0; i < n; i++) {
            rank[w][women[w][i]] = i;
        }
    }

    Queue<Integer> freeMen = new LinkedList<>();
    for (int i = 0; i < n; i++) {
        freeMen.add(i);
    }

    while (!freeMen.isEmpty()) {
        int man = freeMen.poll();

        int woman = men[man][nextProposal[man]];
        nextProposal[man]++;

        if (womanPartner[woman] == -1) {
            // woman is free
            womanPartner[woman] = man;
            manPartner[man] = woman;
        } else {
            int currentMan = womanPartner[woman];

            // check preference
            if (rank[woman][man] < rank[woman][currentMan]) {
                // she prefers new man
                womanPartner[woman] = man;
                manPartner[man] = woman;

                freeMen.add(currentMan); // old man becomes free
            } else {
                // she rejects new man
                freeMen.add(man);
            }
        }
    }

    return manPartner;
    }
}
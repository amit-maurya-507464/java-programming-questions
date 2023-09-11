package org.example;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        towerOfHanoi(n, 'A', 'B', 'C');
    }

    private static void towerOfHanoi(int n, char sourceTower, char destinationTower, char proxyTower) {
        if (n==0) return;
        towerOfHanoi(n-1, sourceTower, proxyTower, destinationTower);
        System.out.printf("Move %d disk from %s to %s %n", n, sourceTower, destinationTower);
        towerOfHanoi(n-1, proxyTower, destinationTower, sourceTower);
    }
}

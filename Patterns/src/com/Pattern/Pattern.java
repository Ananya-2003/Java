package com.Pattern;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		int n = sc.nextInt();
		Pattern1(n);
	}
	}
	static void Pattern1(int n){
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
    static void Pattern2(int n){
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
    static void Pattern3(int n){
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
    static void Pattern4(int n){
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
    static void Pattern5(int n){
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void Pattern6(int n){
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void Pattern7(int n){
		for(int i=0; i<n; i++) {
			//space
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0; j<2*i+1; j++){
				System.out.print("*");
			}
			//space
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void Pattern8(int n){
		for(int i=0; i<n; i++) {
			//space
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0; j<2*n-(2*i+1); j++){
				System.out.print("*");
			}
			//space
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void Pattern10(int n){
		for(int i=1; i<=2*n-1; i++){
			int stars = i;
			if(i>n) stars = 2*n-i;
			for(int j=1; j<=stars; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void Pattern11(int n){
		int start = 1;
		for(int i=0; i<n; i++){
			if(i%2==0) start = 1;
			else start=0;
		for(int j=0; j<i; j++){
			System.out.print(start);
			start = 1-start;
		}
		System.out.println();	
		}
	}

}


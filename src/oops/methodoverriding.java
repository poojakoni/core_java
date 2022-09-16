package oops;

//example for overriding: 
class Bank {
	
	double rateOfInterest() {
		
		return 0;
	}}
class SBI extends Bank{
double rateOfInterest() {
		
		return 10.5;
	}}
class Axis extends Bank{
double rateOfInterest() {
		
		return 11.5;
	}}
class ICIC extends Bank{
double rateOfInterest() {
		
		return 1.3;
	}}
public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI sb=new SBI();
		System.out.println(sb.rateOfInterest());
		
		Axis ax=new Axis();
		System.out.println(ax.rateOfInterest());
		
		ICIC ic=new ICIC();
		System.out.println(ic.rateOfInterest());
	}}

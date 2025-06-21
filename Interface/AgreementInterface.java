interface AgreementInterface{
	void printer();
}
class AgreementClass{
	public void agreement(AgreementInterface ai){
		ai.printer();
	}
}
class AIClass implements AgreementInterface{
	public void printer(){
		System.out.println("printer method");
	}
}

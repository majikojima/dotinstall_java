public class RegisterNote{
	//唯一のインスタンス
	private static RegisterNote registerNote = new RegisterNote();
	private RegisterNote(){

	}
	public static RegisterNote getInstance(){
		return registerNote;
	}
}
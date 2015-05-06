public interface Builder{
	//溶質を追加
	public void addSolute(double solute);
	//溶媒を追加
	public void addSolvent(double solvent);
	//溶液を捨てる
	public void abandonSolution(double solution);
	public Object getResult();
}
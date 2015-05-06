public class SaltWaterBuilder implements Builder{
	private SaltWater saltWater;
	public SaltWaterBuilder(){
		this.saltWater = new SaltWater(0,0);
	}
	public void addSolute(double salt){
		saltWater.salt += salt;
	}
	public void addSolvent(double water){
		saltWater.water += water;
	}
	public void abandonSolution(double saltWaterAmount){
		double saltDelta = saltWaterAmount * 
					(saltWater.salt / (saltWater.salt + saltWater.water));
		double waterDelta = saltWaterAmount * 
					(saltWater.water / (saltWater.salt + saltWater.water));
		saltWater.salt -= saltDelta;
		saltWater.water -= waterDelta;
	}
	public Object getResult(){
		return this.saltWater;
	}
}
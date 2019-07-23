package com.construct;

public class Meal {
	
	public FruitConstruct getFruitconstruct() {
		return fruitconstruct;
	}

	public void setFruitconstruct(FruitConstruct fruitconstruct) {
		this.fruitconstruct = fruitconstruct;
	}

	public VegetableConstruct getVegetableconstruct() {
		return vegetableconstruct;
	}

	public void setVegetableconstruct(VegetableConstruct vegetableconstruct) {
		this.vegetableconstruct = vegetableconstruct;
	}

	public GrainConstruct getGrainconstruct() {
		return grainconstruct;
	}

	public void setGrainconstruct(GrainConstruct grainconstruct) {
		this.grainconstruct = grainconstruct;
	}
	private FruitConstruct fruitconstruct;
	private VegetableConstruct vegetableconstruct;
	private GrainConstruct grainconstruct;
	
	public Meal() {} //no argument construct
	
	public Meal(FruitConstruct f,VegetableConstruct v,GrainConstruct g) {
		this.fruitconstruct=f;
		this.vegetableconstruct=v;
		this.grainconstruct=g;
		
	}
	public String whatInthisMeal() {
		return "Some eatable food is here:";
	}
	}


package minusxl_data_management;

public class MultFunction extends MathFunction {

	private Cell[] input;

	public MultFunction(Cell[] input) {
		// The constructor creates a instance of MultFunction Object
		// and holds the Cells in the input data.
		// DON'T FORGET: The "input" is CELL DATA!!!
		this.input = input;
	}

	@Override
	public Object calculateValue() {
		// Multiplies the values of all the inputed objects together and returns the multiplication value:
		Float mult = 0f;
		int i = 0;
		while (i < input.length) {
			mult = mult * (float) input[i].getCell();
			i++;
		}
		return mult;
	}

}

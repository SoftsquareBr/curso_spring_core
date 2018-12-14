package br.com.softsquare.output;

public class OutputHelper {

	IOutputGenerator outputGenerator;

	public void generateOutput() {

		outputGenerator.generateOutput();

	}

	public  OutputHelper(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
		
	}

}

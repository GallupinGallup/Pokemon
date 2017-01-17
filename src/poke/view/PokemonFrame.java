package poke.view;

import java.awt.Dimension;

import javax.swing.JFrame;

import poke.controller.PokemonController;

public class PokemonFrame extends JFrame {
	
	private PokemonController baseController;
	private PokemonPanel panel;

	public PokemonFrame(PokemonController baseController){
		super();
		this.baseController = baseController;
		this.panel = new PokemonPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame(){
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(1000, 850);
		super.setMinimumSize(new Dimension(650, 520));
		super.setTitle("Pokemon");
		super.setLocationRelativeTo(null);
		super.setContentPane(panel);
		super.setVisible(true);
	}
	
	public PokemonPanel getPanel(){
		return this.panel;
	}
}
package poke.view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import poke.controller.PokemonController;

public class PokemonPanel extends JPanel {
	
	private PokemonController baseController;
	
	private SpringLayout baseLayout;
	
	private ImageIcon pokemonIcon;
	private JButton updateButton;
	private JTextField nameField;
	private JTextField combatField;
	private JTextField healthField;
	private JTextField speedField;
	private JTextField numberField;
	private JTextArea advancedArea;
	private JComboBox pokedexSelector;
	private JLabel advancedLabel;
	private JLabel combatLabel;
	private JLabel healthLabel;
	private JLabel speedLabel;
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel pokemonLabel;
	
	
	public PokemonPanel(PokemonController baseController){
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/poke/view/images/PokeBall.png"));
		this.updateButton = new JButton("Update the stats!");
		this.nameField = new JTextField(20);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10, 25);
		this.pokedexSelector = new JComboBox(baseController.buildPokedexText());
		this.advancedLabel = new JLabel("Advanced information");
		this.combatLabel = new JLabel("Combat Points:");
		this.healthLabel = new JLabel("Health Points:");
		this.speedLabel = new JLabel("Speed Rate:");
		this.numberLabel = new JLabel("Pokemon Number:");
		this.nameLabel = new JLabel("My name is:");
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);

		this.setupPanel();
		this.setupLayout();
		this.setupListeners();
	}
	
	public void setupPanel(){
		super.setLayout(baseLayout);
		
		this.setSize(650, 520);
		
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		
		super.add(updateButton);
		super.add(nameField);
		super.add(combatField);
		super.add(healthField);
		super.add(speedField);
		super.add(numberField);
		super.add(advancedArea);
		super.add(pokedexSelector);
		super.add(advancedLabel);
		super.add(combatLabel);
		super.add(healthLabel);
		super.add(speedLabel);
		super.add(numberLabel);
		super.add(nameLabel);
		super.add(pokemonLabel);
	}
	
	public void setupLayout(){
		
	}
	
	public void setupListeners(){
		
	}

}
	}
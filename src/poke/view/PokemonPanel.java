package poke.view;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import poke.controller.PokemonController;
import poke.model.Pokemon;

public class PokemonPanel extends JPanel {
	
	private PokemonController baseController;
	
	private SpringLayout baseLayout;
	
	
	private ImageIcon pokemonIcon;
	private JButton updateButton;
	private JTextField numberField;
	private JTextField nameField;
	private JTextField nickNameField;
	private JTextField healthField;
	private JTextField defenseField;
	private JTextArea advancedArea;
	private JComboBox<String> pokedexSelector;
	private JLabel advancedLabel;
	private JLabel nickNameLabel;
	private JLabel healthLabel;
	private JLabel defenseLabel;
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
		this.nickNameField = new JTextField(20);
		this.healthField = new JTextField(5);
		this.defenseField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10, 25);
		this.pokedexSelector = new JComboBox(baseController.buildPokedexText());
		this.advancedLabel = new JLabel("Advanced information");
		this.nickNameLabel = new JLabel("Nick Name:");
		this.healthLabel = new JLabel("Health Points:");
		this.defenseLabel = new JLabel("Defense Points:");
		this.numberLabel = new JLabel("Pokemon Number:");
		this.nameLabel = new JLabel("My Name is:");
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);
		
		
		

		this.setupComponents();
		this.setupPanel();
		this.setupLayout();
		this.setupListeners();
	}

	public void setupComponents(){
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		numberField.setEditable(false);
		nameField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);

	}
	
	public void setupPanel(){
		super.setLayout(baseLayout);
		
		this.setSize(1000, 850);
		this.setBackground(Color.LIGHT_GRAY);
		
		super.add(updateButton);
		super.add(nameField);
		super.add(nickNameField);
		super.add(healthField);
		super.add(defenseField);
		super.add(numberField);
		super.add(advancedArea);
		super.add(pokedexSelector);
		super.add(advancedLabel);
		super.add(nickNameLabel);
		super.add(healthLabel);
		super.add(defenseLabel);
		super.add(numberLabel);
		super.add(nameLabel);
		super.add(pokemonLabel);
	}
	
	public void setupLayout(){
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 60, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, nickNameField, 6, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, nickNameField, 0, SpringLayout.EAST, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, nickNameField);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, defenseField, 6, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, defenseField, 0, SpringLayout.EAST, nickNameField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, nickNameField);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, -6, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 6, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, 0, SpringLayout.EAST, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -44, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, advancedArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -6, SpringLayout.NORTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.NORTH, nickNameLabel, 5, SpringLayout.NORTH, nickNameField);
		baseLayout.putConstraint(SpringLayout.EAST, nickNameLabel, 0, SpringLayout.EAST, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, defenseLabel, 5, SpringLayout.NORTH, defenseField);
		baseLayout.putConstraint(SpringLayout.WEST, defenseLabel, 0, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, -6, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -6, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, 0, SpringLayout.SOUTH, updateButton);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 0, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 0, SpringLayout.WEST, pokemonLabel);
	}
	
	public void changeImageDisplay(String pokemonName){
		String path = "/poke/view/images/";
		String defaultName = "PokeBall";
		String extension = ".png";
		try{
			pokemonIcon = new ImageIcon(this.getClass().getResource(path + pokemonName + extension));
		}catch(NullPointerException missingFile){
			pokemonIcon = new ImageIcon(this.getClass().getResource(path + defaultName + extension));
		}
		pokemonLabel.setIcon(pokemonIcon);
		pokemonLabel.setText("My name is: " + pokemonName);
		repaint();
	}
	
	public String getPokemonTypesString(Pokemon pokemon){
		String types = "";
		for(Class<?> inter : pokemon.getClass().getInterfaces()){
			types += inter.getSimpleName().toLowerCase().replaceAll("type", "") + " ";
		}
		return types;
	}
	
	public void setupListeners(){
		updateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isValidInteger(healthField.getText()) && isValidInteger(defenseField.getText())){
					int selected = pokedexSelector.getSelectedIndex();
					baseController.updateSelected(selected, nickNameField.getText(), Integer.parseInt(healthField.getText()), Integer.parseInt(defenseField.getText()));
					pokedexSelector.repaint(); // DOESN'T WORK :(
					pokedexSelector.setModel(new DefaultComboBoxModel<>(baseController.buildPokedexText()));
					pokedexSelector.setSelectedIndex(selected);
				}
			}
		});
		
		pokedexSelector.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Pokemon pokemon = baseController.getPokedex().get(pokedexSelector.getSelectedIndex());
				numberField.setText(String.valueOf(pokemon.getPokedexID()));
				nameField.setText(pokemon.getName());
				nickNameField.setText(pokemon.getNickName());
				healthField.setText(String.valueOf(pokemon.getHealthPoints()));
				defenseField.setText(String.valueOf(pokemon.getDefensePoints()));
				advancedArea.setText(pokemon.getName() + " is of type(s) " + getPokemonTypesString(pokemon) + "\n\n" + pokemon.getAttackString());
				
				setBackground(pokemon.getBackgroundColor());
				changeImageDisplay(pokemon.getName());
			}
		});
	}
	
	private boolean isValidInteger(String input){
		boolean valid = false;
		try{
			Integer.parseInt(input);
			valid = true;
		}catch(NumberFormatException e){
			valid = false;
		}
		return valid;
	}
}
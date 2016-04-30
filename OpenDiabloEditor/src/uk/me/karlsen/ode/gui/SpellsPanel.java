package uk.me.karlsen.ode.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import uk.me.karlsen.ode.stores.SpellsStore;
import uk.me.karlsen.ode.types.Spell;

public class SpellsPanel extends JPanel {

	private SpellsStore spellStore;
	
	public SpellsPanel(SpellsStore spellStore)
	{
		super();
		this.spellStore = spellStore;
		
		GridLayout layout = new GridLayout(0,2);
		this.setLayout(layout);
		
		String[] spellNames = spellStore.getSpellNames();
		String[] comboBoxStrings = new String[spellNames.length + 1]; 
		comboBoxStrings[0] = "None selected";
		System.arraycopy(spellNames, 0, comboBoxStrings, 1, spellNames.length);
		JComboBox<String> comboBox = new JComboBox<String>(comboBoxStrings);
		comboBox.setSelectedIndex(0);

		JLabel cbLabel = new JLabel("Spell selected:");
		this.add(cbLabel);
		this.add(comboBox);
		
		JLabel indexLabel = new JLabel("Index:");
		JTextField indexField = new JTextField();
		this.add(indexLabel);
		this.add(indexField);
		
		//String[] unmoddedSpellNames = TomeOfKnowledge.createSpellNamesArray();
		//unmoddedSpellNames[unmoddedSpellIndex]
		JLabel unmoddedSpellNameLabel = new JLabel("Unmodded spell name:");
		JTextField unmoddedSpellNameField = new JTextField();
		this.add(unmoddedSpellNameLabel);
		this.add(unmoddedSpellNameField);
		
		JLabel manaToCastLabel = new JLabel("Mana to cast:");
		JTextField manaToCastField = new JTextField();
		this.add(manaToCastLabel);
		this.add(manaToCastField);
		
		JLabel animationWhenCastingLabel = new JLabel("Animation when casting:");
		JTextField animationWhenCastingField = new JTextField();
		this.add(animationWhenCastingLabel);
		this.add(animationWhenCastingField);
		
		JLabel pointerToNameAsSpellLabel = new JLabel("Pointer to name as spell:");
		JTextField pointerToNameAsSpellField = new JTextField();
		this.add(pointerToNameAsSpellLabel);
		this.add(pointerToNameAsSpellField);
		
		JLabel nameAsSpellLabel = new JLabel("Name as spell:");
		JTextField nameAsSpellField = new JTextField();
		this.add(nameAsSpellLabel);
		this.add(nameAsSpellField);
		
		JLabel pointerToNameAsSkillLabel = new JLabel("Pointer to name as skill:");
		JTextField pointerToNameAsSkillField = new JTextField();
		this.add(pointerToNameAsSkillLabel);
		this.add(pointerToNameAsSkillField);
		
		JLabel nameAsSkillLabel = new JLabel("Name as skill:");
		JTextField nameAsSkillField = new JTextField();
		this.add(nameAsSkillLabel);
		this.add(nameAsSkillField);
		
		JLabel spellbookQualityLabel = new JLabel("Spellbook quality:");
		JTextField spellbookQualityField = new JTextField();
		this.add(spellbookQualityLabel);
		this.add(spellbookQualityField);
		
		JLabel staffQualityLabel = new JLabel("Staff quality:");
		JTextField staffQualityField = new JTextField();
		this.add(staffQualityLabel);
		this.add(staffQualityField);
		
		JLabel byteTwentyLabel = new JLabel("Byte twenty:");
		JTextField byteTwentyField = new JTextField();
		this.add(byteTwentyLabel);
		this.add(byteTwentyField);
		
		JLabel byteTwentyoneLabel = new JLabel("Byte twentyone:");
		JTextField byteTwentyoneField = new JTextField();
		this.add(byteTwentyoneLabel);
		this.add(byteTwentyoneField);
		
		JLabel byteTwentytwoLabel = new JLabel("Byte twentytwo:");
		JTextField byteTwentytwoField = new JTextField();
		this.add(byteTwentytwoLabel);
		this.add(byteTwentytwoField);
		
		JLabel byteTwentythreeLabel = new JLabel("Byte twentythree:");
		JTextField byteTwentythreeField = new JTextField();
		this.add(byteTwentythreeLabel);
		this.add(byteTwentythreeField);
		
		JLabel spellActiveInTownLabel = new JLabel("Active in town?");
		JTextField spellActiveInTownField = new JTextField();
		this.add(spellActiveInTownLabel);
		this.add(spellActiveInTownField);
		
		JLabel baseRequiredMagicLabel = new JLabel("Base req. magic:");
		JTextField baseRequiredMagicField = new JTextField();
		this.add(baseRequiredMagicLabel);
		this.add(baseRequiredMagicField);
		
		JLabel castingSoundLabel = new JLabel("Casting sound:");
		JTextField castingSoundField = new JTextField();
		this.add(castingSoundLabel);
		this.add(castingSoundField);
		
		JLabel spellEffect1Label = new JLabel("Spell effect 1:");
		JTextField spellEffect1Field = new JTextField();
		this.add(spellEffect1Label);
		this.add(spellEffect1Field);
		
		JLabel spellEffect2Label = new JLabel("Spell effect 2:");
		JTextField spellEffect2Field = new JTextField();
		this.add(spellEffect2Label);
		this.add(spellEffect2Field);
		
		JLabel spellEffect3Label = new JLabel("Spell effect 3:");
		JTextField spellEffect3Field = new JTextField();
		this.add(spellEffect3Label);
		this.add(spellEffect3Field);
		
		JLabel manaStepLabel = new JLabel("Mana step:");
		JTextField manaStepField = new JTextField();
		this.add(manaStepLabel);
		this.add(manaStepField);
		
		JLabel minCastingCostLabel = new JLabel("Min casting cost:");
		JTextField minCastingCostField = new JTextField();
		this.add(minCastingCostLabel);
		this.add(minCastingCostField);
		
		JLabel byteThirtyEightLabel = new JLabel("Byte thirtyeight:");
		JTextField byteThirtyEightField = new JTextField();
		this.add(byteThirtyEightLabel);
		this.add(byteThirtyEightField);
		
		JLabel byteThirtyNineLabel = new JLabel("Byte thirtynine:");
		JTextField byteThirtyNineField = new JTextField();
		this.add(byteThirtyNineLabel);
		this.add(byteThirtyNineField);
		
		JLabel minChargesLabel = new JLabel("Min charges label:");
		JTextField minChargesField = new JTextField();
		this.add(minChargesLabel);
		this.add(minChargesField);
		
		JLabel maxChargesLabel = new JLabel("Max charges label:");
		JTextField maxChargesField = new JTextField();
		this.add(maxChargesLabel);
		this.add(maxChargesField);
		
		JLabel bookCostLabel = new JLabel("Book cost:");
		JTextField bookCostField = new JTextField();
		this.add(bookCostLabel);
		this.add(bookCostField);
		
		JLabel staffCostMultiplierLabel = new JLabel("Staff cost multiplier:");
		JTextField staffCostMultiplierField = new JTextField();
		this.add(staffCostMultiplierLabel);
		this.add(staffCostMultiplierField);
		
		ActionListener spellsListener = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String spellName = (String) comboBox.getSelectedItem();
				if(spellName.equals("None selected")){
					indexField.setText("");
					unmoddedSpellNameField.setText("");
					manaToCastField.setText("");
					animationWhenCastingField.setText("");
					pointerToNameAsSpellField.setText("");
					nameAsSpellField.setText("");
					pointerToNameAsSkillField.setText("");
					nameAsSkillField.setText("");
					spellbookQualityField.setText("");
					staffQualityField.setText("");
					byteTwentyField.setText("");
					byteTwentyoneField.setText("");
					byteTwentytwoField.setText("");
					byteTwentythreeField.setText("");
					spellActiveInTownField.setText("");
					baseRequiredMagicField.setText("");
					castingSoundField.setText("");
					spellEffect1Field.setText("");
					spellEffect2Field.setText("");
					spellEffect3Field.setText("");
					manaStepField.setText("");
					minCastingCostField.setText("");
					byteThirtyEightField.setText("");
					byteThirtyNineField.setText("");
					minChargesField.setText("");
					maxChargesField.setText("");
					bookCostField.setText("");
					staffCostMultiplierField.setText("");
				} else {
					Spell spell = spellStore.getSpellByName(spellName);
					indexField.setText(String.valueOf(spell.getUnmoddedSpellIndex()));
					unmoddedSpellNameField.setText(String.valueOf(spell.getNameAsSpell()));
					manaToCastField.setText(String.valueOf(spell.getManaToCast()));
					animationWhenCastingField.setText(String.valueOf(spell.getAnimationWhenCasting()));
					pointerToNameAsSpellField.setText(String.valueOf(spell.getPointerToNameAsSpell()));
					nameAsSpellField.setText(String.valueOf(spell.getNameAsSpell()));
					pointerToNameAsSkillField.setText(String.valueOf(spell.getPointerToNameAsSkill()));
					nameAsSkillField.setText(String.valueOf(spell.getNameAsSkill()));
					spellbookQualityField.setText(String.valueOf(spell.getSpellbookQuality()));
					staffQualityField.setText(String.valueOf(spell.getStaffQuality()));
					byteTwentyField.setText(String.valueOf(spell.getByteTwenty()));
					byteTwentyoneField.setText(String.valueOf(spell.getByteTwentyone()));
					byteTwentytwoField.setText(String.valueOf(spell.getByteTwentytwo()));
					byteTwentythreeField.setText(String.valueOf(spell.getByteTwentythree()));
					spellActiveInTownField.setText(String.valueOf(spell.getSpellActiveInTown()));
					baseRequiredMagicField.setText(String.valueOf(spell.getBaseRequiredMagic()));
					castingSoundField.setText(String.valueOf(spell.getCastingSound()));
					spellEffect1Field.setText(String.valueOf(spell.getSpellEffect1()));
					spellEffect2Field.setText(String.valueOf(spell.getSpellEffect2()));
					spellEffect3Field.setText(String.valueOf(spell.getSpellEffect3()));
					manaStepField.setText(String.valueOf(spell.getManaStep()));
					minCastingCostField.setText(String.valueOf(spell.getMinCastingCost()));
					byteThirtyEightField.setText(String.valueOf(spell.getByteThirtyEight()));
					byteThirtyNineField.setText(String.valueOf(spell.getByteThirtyNine()));
					minChargesField.setText(String.valueOf(spell.getMinCharges()));
					maxChargesField.setText(String.valueOf(spell.getMaxCharges()));
					bookCostField.setText(String.valueOf(spell.getBookCost()));
					staffCostMultiplierField.setText(String.valueOf(spell.getStaffCostMultiplier()));				
				}
			}
			
		};
		comboBox.addActionListener(spellsListener);
	}
}

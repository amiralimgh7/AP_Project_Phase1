package controller;

import model.DeckModel;
import model.Player;
import model.UserModel;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class GameMatControllerTest {


    @Before
    public void beforeAllClassTest() {
        DeckModel deckModel;
        SetCards.readingCSVFileMonster();
        SetCards.readingCSVFileTrapSpell();
        new UserModel("Guy","123","me");
        new UserModel("Guy2","123","me2");
        MainMenuController.username = "Guy";
        deckModel = new DeckModel("myDeck");
        for (int i = 0; i < 10; i++) {
            deckModel.addCardToMain("Yami");
        }
        for (int i = 0; i < 5; i++) {
            deckModel.addCardToSide("Battle Ox");
        }
        new Player("me", deckModel, true, 1);
        new Player("me2", deckModel, false, 1);
        GameMatController.onlineUser="me";
    }
    @Test
    public void run() {
        String input = "menu exit";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(0, GameMatController.run("me","me2"));
    }

    @Test
    public void commandController(){
        MainMenuController.username2 = "Guy2";
        run();
        assertEquals(0,GameMatController.commandController("menu exit"));
        assertEquals(1,GameMatController.commandController("select --monster 5 --opponent"));
        assertEquals(2,GameMatController.commandController("select --monster 2"));
        assertEquals(3,GameMatController.commandController("select --opponent --monster 1"));
        assertEquals(4,GameMatController.commandController("select --spell 1 --opponent"));
        assertEquals(5,GameMatController.commandController("select --spell 1"));
        assertEquals(6,GameMatController.commandController("select --opponent --spell 1"));
        assertEquals(7,GameMatController.commandController("s -f"));
        assertEquals(8,GameMatController.commandController("select --field --opponent"));
        assertEquals(9,GameMatController.commandController("select --hand 1"));
        assertEquals(10,GameMatController.commandController("select -d"));
        assertEquals(11,GameMatController.commandController("next phase"));
        assertEquals(12,GameMatController.commandController("summon"));
        assertEquals(13,GameMatController.commandController("set"));
//        assertEquals(14,GameMatController.commandController(""));
        assertEquals(15,GameMatController.commandController("flip-summon"));
//        assertEquals(16,GameMatController.commandController(""));
        assertEquals(17,GameMatController.commandController("attack direct"));
        assertEquals(18,GameMatController.commandController("activate effect"));
        System.setIn( new ByteArrayInputStream("back".getBytes()));
        assertEquals(19,GameMatController.commandController("card show --selected"));
        System.setIn( new ByteArrayInputStream("back".getBytes()));
        assertEquals(21,GameMatController.commandController("show graveyard"));
        System.setIn( new ByteArrayInputStream("no".getBytes()));
        assertEquals(22,GameMatController.commandController("show graveyard --opponent"));
        System.setIn( new ByteArrayInputStream("back".getBytes()));
        assertEquals(23,GameMatController.commandController("show main deck"));
        System.setIn( new ByteArrayInputStream("back".getBytes()));
        assertEquals(24,GameMatController.commandController("show side deck"));
        System.setIn( new ByteArrayInputStream("back".getBytes()));
        assertEquals(25,GameMatController.commandController("show my hand"));
        assertEquals(26,GameMatController.commandController("increase --LP 12133"));
        assertEquals(27,GameMatController.commandController(""));
        System.setIn( new ByteArrayInputStream("menu exit".getBytes()));
        assertEquals(0,GameMatController.commandController("surrender"));
        System.setIn( new ByteArrayInputStream("menu exit".getBytes()));
        assertEquals(0,GameMatController.commandController("duel set-winner me"));
        System.setIn( new ByteArrayInputStream("menu exit".getBytes()));
        assertEquals(0,GameMatController.commandController("duel set-winner me2"));

    }



    @Test
    public void increaseLP() {
    }

    @Test
    public void getRivalUser() {
    }

    @Test
    public void getMatcher() {
    }

    @Test
    public void getPermission() {
    }

    @Test
    public void selectMonsterCard() {
    }

    @Test
    public void selectSpellCard() {
    }

    @Test
    public void selectFieldCard() {
    }

    @Test
    public void selectHandCard() {
    }

    @Test
    public void selectDelete() {
    }

    @Test
    public void errorOfNoCardSelected() {
    }

    @Test
    public void errorOfInvalidSelection() {
    }

    @Test
    public void summon() {
    }

    @Test
    public void summonInHand() {
    }

    @Test
    public void summonInHandSuccessfully() {
    }

    @Test
    public void summonInMonsterZone() {
    }

    @Test
    public void summonInMonsterZoneSuccessfully() {
    }

    @Test
    public void changeMonsterPosition() {
    }

    @Test
    public void set() {
    }

    @Test
    public void addToMonsterZoneCard() {
    }

    @Test
    public void addToSpellTrapZoneCard() {
    }

    @Test
    public void errorOfWrongPhase() {
    }

    @Test
    public void errorOfFullZone() {
    }

    @Test
    public void specialSummon() {
    }

    @Test
    public void ritualSummon() {
    }

    @Test
    public void tributeMonster() {
    }

    @Test
    public void getAddressOfTributeMonster() {
    }

    @Test
    public void flipSummon() {
    }

    @Test
    public void attack() {
    }

    @Test
    public void attackDirect() {
    }

    @Test
    public void checkForSetTrapToActivateInRivalTurn() {
    }

    @Test
    public void checkForQuickSpellInRivalTurn() {
    }

    @Test
    public void activateTrapEffect() {
    }

    @Test
    public void changePhase() {
    }

    @Test
    public void changeTurn() {
    }

    @Test
    public void endGame() {
    }

    @Test
    public void exchangeCard() {
    }

    @Test
    public void showGameBoard() {
    }

    @Test
    public void showSelectedCard() {
    }

    @Test
    public void backCommand() {
    }

    @Test
    public void activateSpellEffect() {
    }

    @Test
    public void chooseSpellEffectController() {
    }

    @Test
    public void getAddressOfRelatedMonster() {
    }

    @Test
    public void getResponseForEquipSpell() {
    }

    @Test
    public void checkForSpellAbsorption() {
    }

    @Test
    public void checkForMessengerOfPeace() {
    }

    @Test
    public void checkForSupplySquad() {
    }
}
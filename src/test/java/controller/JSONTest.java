package controller;

import model.UserModel;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class JSONTest {

    @Test
    public void writeUserModelInfo() {
        HashMap<String, UserModel> allUsersInfo =UserModel.allUsersInfo;
        ArrayList<String> nicknames = UserModel.allUsersNicknames;
        ArrayList<String> names = UserModel.allUsernames;
        JSON.writeUserModelInfo(allUsersInfo, nicknames, names);
        HashMap<String, UserModel> userInfo = JSON.readUserInfo();
        ArrayList<String> allNicknames = JSON.readUserNicknames();
        ArrayList<String> allNames = JSON.readUsernames();
        assertEquals(allUsersInfo, userInfo);
        assertEquals(nicknames, allNicknames);
        assertEquals(nicknames, allNames);
    }

    @Test
    public void readUserInfo() {
    }

    @Test
    public void readUsernames() {
    }

    @Test
    public void readUserNicknames() {
    }

    @Test
    public void importCard() {
        ArrayList<String> cards=UserModel.importedCards;
        JSON.importCard(cards);
        ArrayList<String> cardsAfterWriting=JSON.exportCad();
        assertEquals(cards,cardsAfterWriting);
    }

    @Test
    public void exportCad() {
    }
}
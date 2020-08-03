package com.example.orderforms;
import com.example.orderforms.dao.FriendAccount;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class HistoryTest {

    @Test
    void  instantiatingAFA(){
        FriendAccount fa = new FriendAccount();
        fa.setName("hi");
    }
    @Test
    void addCustomersToFARepo(){

    }
}

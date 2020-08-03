package com.example.orderforms;

import com.example.orderforms.dao.FuelQuote;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.text.ParseException;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class WalkthroughTest {
    private FuelQuote fq;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
    }

    @Test
    void showerFormTests() throws Exception {
        this.mockMvc.perform(post("/fuel-quote-form")).andExpect(status().isForbidden());
    }

    @Test
    void printTest() throws ParseException {
        FuelQuote fq = new FuelQuote(34, "17930 gable oak ln", "2387-34-23");
        System.out.println(fq.toString());
    }

    @Test
    void occuranceTest() throws ParseException {
        FuelQuote fq = new FuelQuote(34, "17930 gable oak ln", "2387-34-23");
        System.out.println(fq.toString());

        fq = new FuelQuote(324, "17930 fdsfgable oak ln", "2987-34-23");
        System.out.println(fq.toString());

        fq = new FuelQuote(4, "17930 fdsfg233able oak ln", "2987-34-23");
        fq.setState("XD");

        System.out.println(fq.toString());

        assertTrue(fq.hasHistory());
    }

    @Test
    /*void repositoryTest() throws ParseException {
        Friend f = new Friend("user", "pass", "passss");
        FuelQuote fq = new FuelQuote(23, "somewhwer over the rainbow", "2345-23-12");
        FriendAccount friendAccount = new FriendAccount();

        ListStack<FuelQuote> temp = new ListStack<>(); temp.push(fq);
        friendAccount.addPair(f, temp);

    }*/

    //@Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect((ResultMatcher) content().string(containsString("Hello, World")));
    }
}

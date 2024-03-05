package testegran.junitmockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

// me siga em @natanieltech no instagram
class AuthServiceTest {

    @Test
    void testAuthenticationSuccess() {
        // Mock do UserRepository
        UserRepository userRepositoryMock = mock(UserRepository.class);
        User userFake = new User("userTest", "passwordTest");

        when(userRepositoryMock.findUserByUsername("userTest")).thenReturn(userFake);

        AuthService authService = new AuthService(userRepositoryMock);
        boolean result = authService.authenticate("userTest", "passwordTest");

        assertTrue(result);
        verify(userRepositoryMock).findUserByUsername("userTest");
    }
}

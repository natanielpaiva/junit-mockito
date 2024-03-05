package testegran.junitmockito;

import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Override
    public Task getTaskById(Long id) {
        // Lógica para buscar a tarefa pelo ID
        return null; // Implementação fictícia
    }
}

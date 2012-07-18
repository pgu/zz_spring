package pgu;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private final Long resourceId;

    public ResourceNotFoundException(final Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getResourceId() {
        return resourceId;
    }

}
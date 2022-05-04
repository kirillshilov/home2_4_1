package sky.pro.home2_4_1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.INTERNAL_SERVER_ERROR)
public class OutOfBounds extends ArrayIndexOutOfBoundsException  {
}

package store.auth;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("store-auth")
public interface AuthController {

    @PostMapping("/auth/login/")
    public LoginOut login(@RequestBody LoginIn in);

}

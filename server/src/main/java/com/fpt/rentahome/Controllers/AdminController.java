package com.fpt.rentahome.Controllers;


import com.fpt.rentahome.Helpers.ApiResponse;
import com.fpt.rentahome.Models.Admin;
import com.fpt.rentahome.Repositories.AdminRepository;
import com.fpt.rentahome.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

;import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/manage_admin")
public class AdminController {

    private AdminService adminService;
    @Autowired
    private AdminRepository adminRepository;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/add_admin")
    public ResponseEntity<ApiResponse> createAdmin(@RequestBody Admin admin) {
//        if (Objects.nonNull(categoryService.readCategory(category.getCategoryName()))) {
//            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "category already exists"), HttpStatus.CONFLICT);
//        }
        adminService.createAdmin(admin);
        return new ResponseEntity<>(new ApiResponse(true, "created the admin"), HttpStatus.CREATED);
    }


    @GetMapping("/admins")
    public List<Admin> getAllAdmins() {
        return (List<Admin>) adminRepository.findAll();
    }


}

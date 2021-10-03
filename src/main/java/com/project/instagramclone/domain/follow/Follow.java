//package com.project.instagramclone.domain.follow;
//
//import com.project.instagramclone.domain.user.User;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Entity
//@NoArgsConstructor
//@Getter
//@Builder
//public class Follow {
//
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "following_id")
//    private User following;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "follwer_id")
//    private User follwer;
//
//
//}

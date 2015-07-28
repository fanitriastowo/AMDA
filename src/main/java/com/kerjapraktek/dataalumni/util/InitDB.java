/*
 * Copyright (C) 2015 badass
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.kerjapraktek.dataalumni.util;

import com.kerjapraktek.dataalumni.dao.UserDao;
import com.kerjapraktek.dataalumni.entities.User;
import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author badass
 */
@Service
@Transactional
public class InitDB {

    @Autowired
    private UserDao userDao;

    @PostConstruct
    public void initDB() {

        User userAdmin = new User();
        userAdmin.setUsername("admin");
        userAdmin.setPassword("admin");
        userDao.save(userAdmin);
    }
}

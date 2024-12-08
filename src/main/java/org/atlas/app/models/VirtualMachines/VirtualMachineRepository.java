package org.atlas.app.models.VirtualMachines;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VirtualMachineRepository extends JpaRepository<VirtualMachine, String> {
    List<VirtualMachine> getAllMachinesByUser(String userId);
}

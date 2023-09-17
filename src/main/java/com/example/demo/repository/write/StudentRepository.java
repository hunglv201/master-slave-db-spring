//package com.example.demo.repository.write;
//
//import com.example.demo.model.Student;
//import com.example.demo.repository.write.StudentWriteRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@AllArgsConstructor
//@Repository
//public class StudentRepository implements StudentWriteRepository {
//
//    private final StudentWriteRepository readRepository;
//    private final StudentWriteRepository writeRepository;
//
//    @Override
//    public <S extends Student> S save(S s) {
//        return writeRepository.save(s);
//    }
//
//    @Override
//    public <S extends Student> Iterable<S> saveAll(Iterable<S> iterable) {
//        return writeRepository.saveAll(iterable);
//    }
//
//    @Override
//    public Optional<Student> findById(Long aLong) {
//        return readRepository.findById(aLong);
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return readRepository.existsById(aLong);
//    }
//
//    @Override
//    public Iterable<Student> findAll() {
//        return readRepository.findAll();
//    }
//
//    @Override
//    public Iterable<Student> findAllById(Iterable<Long> iterable) {
//        return readRepository.findAllById(iterable);
//    }
//
//    @Override
//    public long count() {
//        return readRepository.count();
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//        writeRepository.deleteById(aLong);
//    }
//
//    @Override
//    public void delete(Student Student) {
//        writeRepository.delete(Student);
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//        writeRepository.deleteAllById(longs);
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Student> iterable) {
//        writeRepository.deleteAll(iterable);
//    }
//
//    @Override
//    public void deleteAll() {
//        writeRepository.deleteAll();
//    }
//}

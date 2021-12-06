package com.example.transportmodule.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.transportmodule.Model.Student;
import com.example.transportmodule.R;

import java.util.List;

class SearchViewHolder extends RecyclerView.ViewHolder{
    public TextView name,registernumber,year,department,hosteller,dayscholar,collegebus,privatebus,busnumber,boardingplace,busfees,vaccination,contactnumber,communicationaddress;
    public SearchViewHolder(@NonNull View itemView) {
        super(itemView);
        name=(TextView)itemView.findViewById(R.id.name);
        registernumber=(TextView)itemView.findViewById(R.id.registernumber);
        year=(TextView)itemView.findViewById(R.id.year);
        department=(TextView)itemView.findViewById(R.id.department);
        hosteller=(TextView)itemView.findViewById(R.id.hosteller);
        dayscholar=(TextView)itemView.findViewById(R.id.dayscholar);
        collegebus=(TextView)itemView.findViewById(R.id.collegebus);
        privatebus=(TextView)itemView.findViewById(R.id.privatebus);
        busnumber=(TextView)itemView.findViewById(R.id.busnumber);
        boardingplace=(TextView)itemView.findViewById(R.id.boardingplace);
        busfees=(TextView)itemView.findViewById(R.id.busfees);
        vaccination=(TextView)itemView.findViewById(R.id.vaccination);
        contactnumber=(TextView)itemView.findViewById(R.id.contactnumber);
        communicationaddress=(TextView)itemView.findViewById(R.id.communicationaddress);
    }
}
public class Searchadapter extends RecyclerView.Adapter<SearchViewHolder> {
    private Context context;
    private List<Student> students;

    public Searchadapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;

    }
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView= layoutInflater.inflate(R.layout.layout_item,parent,false);
        return new SearchViewHolder(itemView) ;
    }
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        holder.name.setText(students.get(position).getName());
        holder.registernumber.setText(students.get(position).getRegisterNumber());
        holder.year.setText(students.get(position).getYear());
        holder.department.setText(students.get(position).getDepartment());
        holder.hosteller.setText(students.get(position).getHosteller());
        holder.dayscholar.setText(students.get(position).getDayscholar());
        holder.collegebus.setText(students.get(position).getCollegebus());
        holder.privatebus.setText(students.get(position).getPrivatebus());
        holder.busnumber.setText(students.get(position).getBusnumber());
        holder.busfees.setText(students.get(position).getBusfees());
        holder.boardingplace.setText(students.get(position).getBoardingplace());
        holder.vaccination.setText(students.get(position).getVaccination());
        holder.contactnumber.setText(students.get(position).getContactnumber());
        holder.communicationaddress.setText(students.get(position).getCommunicationaddress());
    }
    public int getItemCount() {
        return students.size();
    }
}



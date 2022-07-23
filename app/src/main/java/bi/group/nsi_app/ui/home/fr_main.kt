package bi.group.nsi_app.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import bi.group.nsi_app.adapter.Order_adapter
import bi.group.nsi_app.databinding.FragmentHomeBinding
import com.shady.recycleviewapp.UserRecycleViewAdapter

class fr_main : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val model =
                ViewModelProvider(this).get(main_model::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val rv: RecyclerView = binding.recyclerView
        model.getAllUsers().observe(viewLifecycleOwner, Observer {
            rv.adapter = UserRecycleViewAdapter(it)
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}